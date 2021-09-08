# Microservice to send emails

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

## Setup Locally

To run this app locally, you will have to install `docker` and `docker-compose`.

After install the two tools needed, you will have to change the value of variable in `docker-compose.yml` file on the root folder of the project. Basically, you have to change the information below:
``` yml
      SPRING_MAIL_USERNAME: ********@gmail.com # I'm using GMAIL SMTP service to send the emails, so you will have to inform your own google email 
      SPRING_MAIL_PASSWORD: ******** # This is not the password of your Gmail account, please, follow this link https://support.google.com/accounts/answer/185833
```

After setup the information above, run this command(this will generate the images and get up and running the containers):
```sh
docker-compose up -d
```

To test if everything is working, do a POST request in the endpoint `localhost:8080:send-mail` with the payload below filled with your information:
```json
{
	"ownerReference": "<Reference of owner who is sending the message>",
	"mailFrom": "<Email from>",
	"mailTo": "<Email to>",
	"subject": "<Subject>",
	"body": "<Email Text>"
}
```

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.


<!-- MARKDOWN LINKS & IMAGES -->
[contributors-shield]: https://img.shields.io/github/contributors/gabrielpadilh4/ms-mail.svg?style=for-the-badge
[contributors-url]: https://github.com/gabrielpadilh4/ms-mail/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/gabrielpadilh4/ms-mail.svg?style=for-the-badge
[forks-url]: https://github.com/gabrielpadilh4/ms-mail/network/members
[stars-shield]: https://img.shields.io/github/stars/gabrielpadilh4/ms-mail.svg?style=for-the-badge
[stars-url]: https://github.com/gabrielpadilh4/ms-mail/stargazers
[issues-shield]: https://img.shields.io/github/issues/gabrielpadilh4/ms-mail.svg?style=for-the-badge
[issues-url]: https://github.com/gabrielpadilh4/ms-mail/issues
[license-shield]: https://img.shields.io/github/license/gabrielpadilh4/ms-mail.svg?style=for-the-badge
[license-url]: https://github.com/gabrielpadilh4/ms-mail/blob/master/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/gabriel-padilha